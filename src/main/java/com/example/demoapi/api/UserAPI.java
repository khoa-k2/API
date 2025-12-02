package com.example.demoapi.api;

import com.example.demoapi.entity.UserEntity;
import com.example.demoapi.service.UserService;
import jakarta.servlet.ServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/user/v1")
@RequiredArgsConstructor
public class UserAPI {
    final UserService userService;


    @PostMapping("/login")

    public ResponseEntity<?> DoPostLogin(@RequestParam("gmail") String gmail,
                                         @RequestParam("password") String password) {

        HashMap<String, Object> response = new HashMap<>();
        try {

            UserEntity result = userService.getUserByGmailAndPassword(gmail, password);
            response.put("status", true);
            response.put("message", "Login successful");

//             System.out.println(1/0);
            if (Objects.isNull(result)) {
                response.put("message", "người dung khong ton tai");
                response.put("data",null);


            } else {
                response.put("message", "Login successful");
                response.put("data",result);

            }
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            e.printStackTrace();
            response.put("status", false);
            response.put("message", "he thong bi loi");
            response.put("data",null);
            return ResponseEntity.ok(response);

        }



    }

    @PostMapping("/get-all-user")
    public ResponseEntity<?> DoPostLogin(ServletResponse servletResponse) {

        try {
            List<UserEntity> result = userService.GetAllUsers();
            if (result.isEmpty()) {
                return ResponseEntity.ok(null);
            }else{
                return ResponseEntity.ok(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok("he thong bi loi");
        }


    }
}
