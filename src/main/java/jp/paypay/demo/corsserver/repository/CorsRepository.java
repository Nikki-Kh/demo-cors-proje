package jp.paypay.demo.corsserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jp.paypay.demo.corsserver.model.Cors;

import java.util.Optional;

public interface CorsRepository extends JpaRepository<Cors,Long> {
    Optional<Cors> findByUrl(String url);
}