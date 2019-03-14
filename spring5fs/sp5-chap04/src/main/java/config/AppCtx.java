package main.java.config;

import main.java.spring.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppCtx {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberRegisterService memberRegSvc() {
        return new MemberRegisterService();
    }

    @Bean
    public ChangePasswordService changePwdSvc() {
       // pwdSvc.setMemberDao(memberDao());
        //@Autowired에 의해 자동 주입이 된다.
        return new ChangePasswordService();
    }

    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter1() {
        return new MemberPrinter();
    }
    @Bean
    @Qualifier("summaryPrinter")
    public MemberSummaryPrint memberPrinter2(){
        return  new MemberSummaryPrint();
    }

    @Bean
    public MemberListPrinter listPrinter() {
        return new MemberListPrinter();
    }

    @Bean
    public MemberInfoPrinter infoPrinter() {
      MemberInfoPrinter infoPrinter = new MemberInfoPrinter(); //설정클래스에서 세터메서드로 의존주입을 해도 해당 세터메소드에
        infoPrinter.setPrinter(memberPrinter2());              //@Autowired가 붙어있으면 무시하고 @Autowired한 빈을 사용한다.
        return new MemberInfoPrinter();
    }

    @Bean
    public VersionPrinter versionPrinter() {
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }
}
