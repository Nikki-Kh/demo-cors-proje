package jp.paypay.demo.corsserver.repository;

import jp.paypay.demo.corsserver.mapper.CorsDomainMapper;
import jp.paypay.demo.corsserver.model.CorsDomainDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class CorsDomainRepository {

    @Autowired
    private CorsDomainMapper corsDomainMapper;

    public Set<CorsDomainDto> getAllCorsDomains() {
        return  corsDomainMapper.getAllCorsDomains();
    }

    public void insertNewDomain(String domain) {
        corsDomainMapper.insertNewDomain(domain);
    }

}
