/**
 * @copyright 2012 City of Bloomington, Indiana
 * @license http://www.gnu.org/licenses/gpl.txt GNU/GPL, see LICENSE.txt
 * @author Jaakko Rajaniemi <jaakko.rajaniemi@hel.fi>
 */

package gov.in.bloomington.georeporter.util;

import gov.in.bloomington.georeporter.models.Open311;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class Open311Parser {
    private String mFormat = Open311.JSON;

    public Open311Parser(String format) {
        mFormat = format;
    }

    /**
     * Parses a GET Services response into JSON
     * 
     * @param response
     * @return JSONArray
     */
    public JSONArray parseServices(String response) {
        try {
            if (mFormat.equals(Open311.JSON)) {
                return new JSONArray(response);
            }
            else {
                Open311XmlParser mParser = new Open311XmlParser();
                // return mParser.parseServices(response);
            }
        } catch (JSONException e) {            
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param xml
     * @return JSONObject
     */
    public JSONObject parseServiceDefinition(String xml) {
        try {
            if (mFormat.equals(Open311.JSON)) {
                return new JSONObject(xml);
            } else {
                Open311XmlParser mParser = new Open311XmlParser();
                // return mParser.parseServiceDefinition(xml);
            }
        } catch (JSONException e) {            
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param xml
     * @return JSONArray
     */
    public JSONArray parseRequests(String xml) {
        try {
            if (mFormat.equals(Open311.JSON)) {
                return new JSONArray(xml);
            } else {
                Open311XmlParser mParser = new Open311XmlParser();
                // return mParser.parseRequests(xml);
            }
        } catch (JSONException e) {            
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param xml
     * @return JSONArray
     */
    public JSONArray parseErrors(String xml) {
        try {
            if (mFormat.equals(Open311.JSON)) {
                return new JSONArray(xml);
            } else {
                Open311XmlParser mParser = new Open311XmlParser();
                return mParser.parseErrors(xml);
            }
        } catch (JSONException e) {            
            e.printStackTrace();
        } catch (XmlPullParserException e) {            
            e.printStackTrace();
        } catch (IOException e) {            
            e.printStackTrace();
        }
        return null;
    }
}

