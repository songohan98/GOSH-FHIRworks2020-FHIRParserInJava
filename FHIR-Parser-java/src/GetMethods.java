import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class GetMethods {
    String data;
    JSONArray arr;
    ArrayList<Patient> patient;

    public GetMethods(String data) throws JSONException {
        this.data = data;
        this.arr = new JSONArray(this.data);
        patient = new ArrayList<>();
        for (int i = 0; i < arr.length(); i++) {
            for (int j = 0; j < arr.getJSONObject(i).getJSONArray("entry").length(); j++) {
                patient.add(new Patient(getGiven(i, j),
                        getFamily(i, j),
                        getPrefix(i, j),
                        getPhone(i, j),
                        getID(i, j),
                        getResrcType(i, j),
                        getGender(i, j),
                        getDoB(i, j),
                        getMaritial(i, j),
                        getHouse(i, j),
                        getCity(i, j),
                        getState(i, j),
                        getPostCode(i, j),
                        getCountry(i, j)
                ));
            }
        }
    }

    private String getGiven(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONArray("name").getJSONObject(0).getJSONArray("given").getString(0);
        } catch (JSONException e) {
            return "";
        }
    }

    private String getFamily(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONArray("name").getJSONObject(0).getString("family");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getPrefix(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONArray("name").getJSONObject(0).getJSONArray("prefix").getString(0);
        } catch (JSONException e) {
            return "";
        }
    }

    private String getPhone(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONArray("telecom").getJSONObject(0).getString("value");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getID(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getString("id");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getResrcType(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getString("resourceType");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getGender(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getString("gender");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getDoB(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getString("birthDate");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getMaritial(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONObject("maritalStatus").getString("text");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getHouse(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONArray("address").getJSONObject(0).getJSONArray("line").getString(0);
        } catch (JSONException e) {
            return "";
        }
    }

    private String getCity(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONArray("address").getJSONObject(0).getString("city");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getState(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONArray("address").getJSONObject(0).getString("state");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getPostCode(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONArray("address").getJSONObject(0).getString("postalCode");
        } catch (JSONException e) {
            return "";
        }
    }

    private String getCountry(int i, int j) {
        try {
            return arr.getJSONObject(i).getJSONArray("entry").getJSONObject(j).getJSONObject("resource").getJSONArray("address").getJSONObject(0).getString("country");
        } catch (JSONException e) {
            return "";
        }
    }
    private Patient g(int i){
        //this gets the patient no
        return patient.get(i);
    }
    public void getAllPatientDetails() {
        for (int i = 0; i < patient.size(); i++) {
            System.out.println(
                    "Patient #: "+ i + "\tType: " + g(i).resourceType+"\n"+
                    "\tPatient ID: "+ g(i).id + " \n"+
                    "\tFull name: " + g(i).prefix +" "+ g(i).givenName +" "+ g(i).familyName +" \n"+
                    "\tBirth Date: " + g(i).birthdate + "\tGender: " + g(i).gender + "\tMarital Status: "+ g(i).maritialStatus + " \n"+
                    "\tAddress\n"+ "\t\tHouse: "+g(i).house + "\tCity: "+ g(i).getCity() + "\tState: "+ g(i).state + "\n"+
                                   "\t\tPostal Code: "+g(i).postalCode + "\tCountry: "+g(i).country+"\n\tContact: "+g(i).phone + "\n"
                    );
        }
    }


}
