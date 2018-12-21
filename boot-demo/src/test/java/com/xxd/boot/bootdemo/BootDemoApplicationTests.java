package com.xxd.boot.bootdemo;

import com.xxd.boot.bootdemo.entity.User;
import com.xxd.boot.bootdemo.mapper.UserMapper;
import com.xxd.boot.bootdemo.rest.UserController;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDemoApplicationTests {

    MockMvc mockMvc;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() {
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void contextLoads() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/user/all"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
        System.out.println(resultActions.andReturn().getResponse().getContentAsString());
    }

    @Test
    public void testMybatis() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper1.selectAll();
//        List<User> users2 = mapper1.selectAll();
        int i = 1;
    }

}
