package net.springboot.guide.ba.repository;

import net.springboot.guide.ba.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
