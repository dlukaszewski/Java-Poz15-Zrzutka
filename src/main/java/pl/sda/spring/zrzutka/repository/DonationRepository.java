package pl.sda.spring.zrzutka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.spring.zrzutka.model.Donation;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Long> {
    List<Donation> findByWhiproundId(Long whiproundId);

}
