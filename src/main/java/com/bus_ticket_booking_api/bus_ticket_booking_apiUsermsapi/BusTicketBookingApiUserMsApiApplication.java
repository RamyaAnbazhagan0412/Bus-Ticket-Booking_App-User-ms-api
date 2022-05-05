package com.bus_ticket_booking_api.bus_ticket_booking_apiUsermsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class BusTicketBookingApiUserMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusTicketBookingApiUserMsApiApplication.class, args);
	}

}
