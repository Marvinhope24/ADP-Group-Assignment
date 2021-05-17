/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Marvin Hope - 219445842
 */
public class EmployDetailsTest {
    private EmployDetails Employ1;
    private EmployDetails Employ2;
    private EmployDetails Employ3;
     
    @BeforeEach
    public void setUp() {
        Employ1 = new EmployDetails();
        Employ2 = new EmployDetails();
        Employ3 = Employ1;
    }
    
    @Test
    public void testIdentity(){
        assertSame(Employ3, Employ1);
    }
    
    @Test
    public void testEqulity(){
        assertEquals(Employ3, Employ1);
    }
    
    @Test
    void FallingTest()
    {
        fail("This test will fail");
    }
    
    @Test
    @Timeout(10)
    /*This will timeout*/
    public void testTimeOut()throws InterruptedException
    {
         while(true)
         {
             Thread.sleep(300);
         }
    }
    
    @Test
    @Disabled
    /*This will disable the test*/
    public void testDisabled()
    {} 

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
