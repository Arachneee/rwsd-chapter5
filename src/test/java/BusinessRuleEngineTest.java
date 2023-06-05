package test.java;

import main.java.Action;
import main.java.BusinessRuleEngine;

public class BusinessRuleEngineTest {
    @Test
    void shouldExcuteOneAction(){
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        final Action mockAction = mock(Action.class);
    }
}
