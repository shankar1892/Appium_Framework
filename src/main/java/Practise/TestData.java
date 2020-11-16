package Practise;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name ="getData")
    public Object[] getDataforEditBox(){
        Object[][] obj=new Object[][]
                {
                        {"sddgdgdd"} , {"@###^#@!^^!#"}
                };

        return  obj;
    }
}
