/**
 * 
 */
package com.LMS.APIAutomation.RequestPayload;

/**
 * @author sa185402
 *
 */
public class MemberServiceRequestPayLoad {
		
	public static String loginRequest(String UserName, String Password) {
		return "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\r\n"
				+ "  <soap:Body>\r\n"
				+ "    <UserLogin xmlns=\"http://www.retalix.com/HQLWebServices\">\r\n"
				+ "      <in_UserName>"+UserName+"</in_UserName>\r\n"
				+ "      <in_Password>"+Password+"</in_Password>\r\n"
				+ "    </UserLogin>\r\n"
				+ "  </soap:Body>\r\n"
				+ "</soap:Envelope>";
	}
	
	public static String ValidateCard(String CardId) {
		return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
				+ "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n"
				+ "  <soap:Body>\r\n"
				+ "    <CardValidate xmlns=\"http://www.retalix.com/HQLWebServices\">\r\n"
				+ "      <in_ClubCardId>"+CardId+"</in_ClubCardId>\r\n"
				+ "    </CardValidate>\r\n"
				+ "  </soap:Body>\r\n"
				+ "</soap:Envelope>";
	}
	
}
