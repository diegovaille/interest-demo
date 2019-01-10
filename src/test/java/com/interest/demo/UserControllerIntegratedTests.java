package com.interest.demo;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.interest.demo.model.Risk;
import com.interest.demo.model.dto.UserCreditRiskDto;
import com.interest.demo.utils.Constants;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class UserControllerIntegratedTests {

	@Autowired
	private MockMvc mockMvc;
	
	@SuppressWarnings("rawtypes")
	private HttpMessageConverter mappingJackson2HttpMessageConverter;
	
	@Autowired
	void setConverters(HttpMessageConverter<?>[] converters) {
		this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream()
				.filter(hmc -> hmc instanceof MappingJackson2HttpMessageConverter).findAny().get();

		assertNotNull("the JSON message converter must not be null", this.mappingJackson2HttpMessageConverter);
	}
	
	@SuppressWarnings("unchecked")
	protected String json(Object o) throws IOException {
		MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
		this.mappingJackson2HttpMessageConverter.write(o, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
		return mockHttpOutputMessage.getBodyAsString();
	}
	
	@Test
	public void shouldReturnBadRequestWhenEmptyUserCreditRiskDtoIsGiven() throws Exception {
		
		UserCreditRiskDto dto = new UserCreditRiskDto();
		mockMvc.perform(post("/user"+Constants.CREDIT_RISK).contentType(MediaType.APPLICATION_JSON).content(json(dto)))
		.andExpect(status().isBadRequest());
	}
	
	@Test
	public void shouldReturnCreatedStatusWhenValidUserCreditRiskIsGiven() throws Exception {
		UserCreditRiskDto dto = new UserCreditRiskDto();
		dto.setClientName("Teste");
		dto.setCreditLimit(10000D);
		dto.setRiskType(Risk.B);
		mockMvc.perform(post("/user"+Constants.CREDIT_RISK).contentType(MediaType.APPLICATION_JSON).content(json(dto)))
		.andExpect(status().isCreated());
	}
}
