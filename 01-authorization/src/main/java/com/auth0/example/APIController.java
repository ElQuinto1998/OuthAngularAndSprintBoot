package com.auth0.example;

import com.auth0.example.model.Deals;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Controller
@Component
public class APIController {

    @RequestMapping(value = "/api/public", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Deals> publicEndpoint() {

        ArrayList<Deals> dealsPublics = new ArrayList<>();

        Deals d1 = new Deals("12231","Playstation 4 500GB Console",
                "The Playstation 4 is the next gen console to own. With the best games and online experience.",399.99, 299.99);

        Deals d2 = new Deals("12234","Galaxy Note 7",
                "The Note 7 has been fixed and will no longer explode. Get it an amazing price!",899.99, 499.99);

        Deals d3 = new Deals("12245","Macbook Pro 2016",
                "The Macbook Pro is the de-facto standard for best in breed mobile computing.",2199.99, 1999.99);

        Deals d4 = new Deals("12267","Amazon Echo",
                "Turn your home into a smart home with Amazon Echo. Just say the word and Echo will do it.",199.99, 149.99);

        Deals d5 = new Deals("12288","Nest Outdoor Camera",
                "The Nest Outdoor camera records and keeps track of events outside your home 24/7.",299.99, 199.99);

        dealsPublics.add(d1);
        dealsPublics.add(d2);
        dealsPublics.add(d3);
        dealsPublics.add(d4);
        dealsPublics.add(d5);

        return dealsPublics;
    }

    @RequestMapping(value = "/api/private", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Deals> privateEndpoint() {

        ArrayList<Deals> dealsPrivates = new ArrayList<>();

        Deals d1 = new Deals("14423","Tesla S",
                "Ride in style and say goodbye to paying for gas. The Tesla S is the car of the future.",90000.00, 75000.00);

        Deals d2 = new Deals("14553","DJI Phantom 4",
                "The Drone revolution is here. Take to the skies with the DJI Phantom 4.",1299.99, 749.99);

        Deals d3 = new Deals("15900","iPhone 7 - Jet Black",
                "Get the latest and greatest iPhone in the limited edition jet black.",899.99, 799.99);

        Deals d4 = new Deals("16000","Samsung 4K HDR TV",
                "Watch as if you were there with the latest innovations including 4K and HDR.",2999.99, 2499.99);

        Deals d5 = new Deals("17423","Canon t8i DSLR",
                "Capture life\\'s moments with the amazing Canon t8i DSLR",999.99, 549.99);

        dealsPrivates.add(d1);
        dealsPrivates.add(d2);
        dealsPrivates.add(d3);
        dealsPrivates.add(d4);
        dealsPrivates.add(d5);

        return dealsPrivates;



    }

    @RequestMapping(value = "/api/private-scoped", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String privateScopedEndpoint() {
        return new JSONObject()
                .put("message", "All good. You can see this because you are Authenticated with a Token granted the 'read:messages' scope")
                .toString();
    }

}
