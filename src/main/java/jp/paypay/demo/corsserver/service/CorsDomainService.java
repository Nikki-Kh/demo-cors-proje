package jp.paypay.demo.corsserver.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import jp.paypay.demo.corsserver.model.CorsDomainDto;
import jp.paypay.demo.corsserver.repository.CorsDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Set;

@Service
public class CorsDomainService {

    private Set<CorsDomainDto> cache;

    static ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private final CorsDomainRepository repository;

    public CorsDomainService(CorsDomainRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        cache = repository.getAllCorsDomains();
    }

    public Set<CorsDomainDto> getCorsDomainDtos() {
        return  cache;
    }

    public void insertNewDomain(String domain) {
        repository.insertNewDomain(domain);
        invalidateCache();
    }

    private void invalidateCache() {
        cache = repository.getAllCorsDomains();
    }


}
