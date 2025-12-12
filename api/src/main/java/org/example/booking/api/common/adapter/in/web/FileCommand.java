package org.example.booking.api.common.adapter.in.web;


import org.example.booking.api.common.adapter.in.web.dto.FileDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common/file")
public class FileCommand {


    @PostMapping
    public void uploadFile(@RequestBody FileDto.FileCommandRequest request) {

    }
}
