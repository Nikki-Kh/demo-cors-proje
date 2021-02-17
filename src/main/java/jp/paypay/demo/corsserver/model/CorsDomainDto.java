package jp.paypay.demo.corsserver.model;

public class CorsDomainDto {

    private Long id;

    private String origin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "CorsDomainDto{" +
                "id=" + id +
                ", domainName='" + origin + '\'' +
                '}';
    }
}
