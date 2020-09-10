package com.example.jpapractice.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
public class JpaTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void persist() throws Exception {
        String a = "{\n    \"id\": 1,\n    \"name\": \"둔덩\"\n}";
        System.out.println(a);
        mockMvc.perform(post("/dto")
                .content(a)
                .contentType(MediaType.APPLICATION_JSON));
    }
}