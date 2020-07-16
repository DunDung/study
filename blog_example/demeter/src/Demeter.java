class Demeter {
    private Member member;

    public myMethod(OtherObject other) {
        // ...
    }

    /* 디미터의 법칙을 잘 따른 예 */
    public okLawOfDemeter(Paramemter param) {
        myMethod();     // 1. 객체 자신의 메서드들
        param.paramMethod();    // 2. 메서드의 파라미터로 넘어온 객체들의 메서드들
        Local local = new Local();
        local.localMethod();    // 3. 메서드 내부에서 생성, 초기화된 객체의 메서드들
        member.memberMethod();   // 4. 인스턴스 변수로 가지고 있는 객체가 소유한 메서드
    }

    /* 디미터의 법칙을 어긴 예 */
    public violateLawOfDemeter(Paramemter param) {
        Son son = param.getSon();
        son.violate1();    // 인자로 받은 객체에서의 호출.
        param.getDaughter().violate2();      // 위와 같음.
        param.getSon().getGrandSon().violate3();  // 당근 더더욱 안돼겠죠?
    }
}
