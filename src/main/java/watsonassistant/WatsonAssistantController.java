package watsonassistant;
import java.util.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WatsonAssistantController {

    private WatsonAssistantService watsonAssistantService;

    @Autowired
    public WatsonAssistantController(WatsonAssistantService watsonAssistantService) {
        this.watsonAssistantService = watsonAssistantService;
    }

    @RequestMapping(value="/send", method = RequestMethod.GET)
    public JsonNode send(@RequestParam("message") String message) throws JsonProcessingException {

        //String response1 = watsonAssistantService.sendMessage("who are you");
        WatsonAssistantMessage response;
        response = watsonAssistantService.sendMessage(message);

        return response.getGeneric();

    }
    @RequestMapping(value="/test")
    public String test(){

        //String response1 = watsonAssistantService.sendMessage("who are you");
       //testing

      
        return "Server Working in ibm";

    }
    @PostMapping(value="/webhook")
public String getAccountDetails(@RequestBody Map<String,String> webval) throws JSONException {
    	  JSONObject json = new JSONObject();
       String value=webval.get("get_all");
    	String[] parts=value.split(",");
    	String part1= parts[0];
    	String part2= parts[1];
    	
    	
  
    	if( part1.equals("0") ) { 
    		json.put("out", AccountService.getTransactionDetails(part2));
    		return json.toString();
    	}
    	else {
    		json.put("out", AccountService.getAccountDetails(part1));
    		return json.toString();
		
    	}
    }

	

	private String getTransaction() {
		// TODO Auto-generated method stub
		return "";
	}
    
    
}
