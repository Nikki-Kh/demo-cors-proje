package jp.paypay.demo.corsserver.mapper;

import jp.paypay.demo.corsserver.model.CorsDomainDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface CorsDomainMapper {

    @Select("select * from cors_domains")
    public Set<CorsDomainDto> getAllCorsDomains();

    @Insert("insert into cors_domains(cors_domain) values(#{domainStr})")
    public void insertNewDomain(String domainStr);

}
