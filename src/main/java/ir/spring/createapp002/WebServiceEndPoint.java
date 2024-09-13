package ir.spring.createapp002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ir.spring.createapp002.object.GetCarReq;
import ir.spring.createapp002.object.GetCarRes;

@Endpoint
public class WebServiceEndPoint {
	private static final String NAMESPACE = "http://www.spring.ir/createapp002/object";

	private WebServiceRepo repo;

	@Autowired
	public WebServiceEndPoint(WebServiceRepo repo) {
		this.repo = repo;
	}

	@PayloadRoot(namespace = NAMESPACE, localPart = "getCarReq")
	@ResponsePayload
	public GetCarRes getCar(@RequestPayload GetCarReq req) {
		GetCarRes res = new GetCarRes();
		res.setCar(repo.findCar(req.getName()));
		return res;
	}

}
