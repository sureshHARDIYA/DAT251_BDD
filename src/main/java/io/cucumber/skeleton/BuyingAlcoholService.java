package io.cucumber.skeleton;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BuyingAlcoholService {

    public String checkAgeAndTime(String dateOfBirth, String currentTime) {
        try {
            // Parse date of birth and current time
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
            Date time = new SimpleDateFormat("hh:mma").parse(currentTime);

            // Check if the customer is 18 years or older
            if (isEighteenOrOlder(dob) && isWithinAllowedHours(time)) {
                return "Eligible to buy";
            } else {
                return "NOT Eligible to buy";
            }
        } catch (ParseException e) {
            return "Error processing the request";
        }
    }

    private boolean isEighteenOrOlder(Date dob) {
        Date now = new Date();
        long ageInMillis = now.getTime() - dob.getTime();
        long ageInYears = ageInMillis / (365L * 24L * 60L * 60L * 1000L);

        return ageInYears >= 18;
    }

    private boolean isWithinAllowedHours(Date time) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date openingTime = sdf.parse("08:00");
            Date closingTime = sdf.parse("20:00");

            return time.after(openingTime) && time.before(closingTime);
        } catch (ParseException e) {
            return false;
        }
    }
}
