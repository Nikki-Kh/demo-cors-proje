package jp.paypay.demo.corsserver.mapper;

import jp.paypay.demo.corsserver.model.CorsDomainDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface CorsDomainMapper {

    @Select("select * from cors_origins")
    public Set<CorsDomainDto> getAllCorsDomains();

    @Insert("insert into cors_origins(origin) values(#{originStr})")
    public void insertNewDomain(String originStr);


}
