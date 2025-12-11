package org.example.booking.api.service;

import lombok.RequiredArgsConstructor;
import org.example.booking.api.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final MemberRepository memberRepository;

    public void saveMember(){

    }
}
