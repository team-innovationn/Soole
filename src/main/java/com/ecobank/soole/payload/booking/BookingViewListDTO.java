package com.ecobank.soole.payload.booking;

import java.time.LocalDateTime;

import com.ecobank.soole.models.Account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingViewListDTO {
    private Long id;

    private LocalDateTime time_of_departure;

    private LocalDateTime createdAt;

    private String take_off_point;

    private String drop_off_point;

    private String status;

    private String route;

    private String board;

    private Account user;
}
