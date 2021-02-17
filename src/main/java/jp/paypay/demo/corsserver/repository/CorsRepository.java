package jp.paypay.demo.corsserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jp.paypay.demo.corsserver.model.Cors;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CorsRepository extends JpaRepository<Cors,Integer> {

    @Query("select c.isAllowed from Cors c where c.url = ?1")
    List<Boolean> findByUrl(String url);
}