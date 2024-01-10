package com.client.ws.wscurseplus.repository;

import com.client.ws.wscurseplus.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {
}
