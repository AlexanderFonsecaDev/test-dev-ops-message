package co.com.devopsmicroservice.infrastructure;

import co.com.devopsmicroservice.domain.models.Message;
import co.com.devopsmicroservice.infrastructure.data.request.MessageCreateRequest;
import co.com.devopsmicroservice.infrastructure.data.response.MessageCreateResponse;
import co.com.devopsmicroservice.infrastructure.mapper.MessageRestMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EndpointCreateMessage {

    public static final String ENDPOINT = "/DevOps";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private MessageRestMapper messageRestMapper;

    @Test
    public void createMessage() throws Exception {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("localhost")
                .port(8080)
                .path(ENDPOINT)
                .build();



       /* mockMvc.perform(
                MockMvcRequestBuilders.post(uriComponents.toUriString())
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(mapper.writeValueAsString())
                        .andDo(MockMvcResultHandlers.print())
                        .andExpect(status().isCreated())
        );
        */


    }

}
