package com.testAXA.restapi;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.mockito.InjectMocks;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebMvcTest
@ActiveProfiles("test")
class RestapiApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
    private AddController addController;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testadd() throws Exception {
		String resultat = this.mockMvc
		  .perform(get("/add/11/12"))
		  .andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		  assertThat(resultat).isEqualTo(23);
	}

	
	@Test
	void testmult() throws Exception {
		this.mockMvc
		  .perform(get("/mult/11/12"))
		  .andExpect(status().isOk());/* .andExpect(content().string("2"));*/
	}

	@Test
	void testconcat() throws Exception {
		this.mockMvc
		  .perform(get("/concatName/11/12"))
		  .andExpect(status().isOk()); /* .andExpect(content().string("0"));*/
	}




}
