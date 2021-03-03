package com.brunoharnik.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.brunoharnik.hrpayroll.domain.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}