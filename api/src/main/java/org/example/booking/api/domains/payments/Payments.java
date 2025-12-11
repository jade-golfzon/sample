package org.example.booking.api.domains.payments;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@AllArgsConstructor
public class Payments {

    private UUID id;
    private String status;

    private Long amount;
    private String unit;

    private String methods;

    private String cancelAmount;

}
