package org.example.orderservice.client;

import org.example.orderservice.POJO.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("CLIENTSERVICE")
public interface UserClient {

    @GetMapping("/qill7/client/{ClientID}")
    Client getById(@PathVariable("ClientID") Integer ClientID);
}
