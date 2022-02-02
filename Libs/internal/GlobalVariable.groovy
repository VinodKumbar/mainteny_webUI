package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object Valid_Username
     
    /**
     * <p></p>
     */
    public static Object Valid_Password
     
    /**
     * <p></p>
     */
    public static Object Invalid_Username
     
    /**
     * <p></p>
     */
    public static Object Invalid_Password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            URL = selectedVariables['URL']
            Valid_Username = selectedVariables['Valid_Username']
            Valid_Password = selectedVariables['Valid_Password']
            Invalid_Username = selectedVariables['Invalid_Username']
            Invalid_Password = selectedVariables['Invalid_Password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
