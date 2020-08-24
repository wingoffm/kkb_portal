package de.wingo.kkb.api;

import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import de.wingo.kkb.web.api.LoginApiDelegate;
import de.wingo.kkb.web.api.model.Card;
import de.wingo.kkb.web.api.model.LoginUser;

@Service
public class LoginApiDelegateImpl implements LoginApiDelegate {

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return LoginApiDelegate.super.getRequest();
	}

	@Override
	public ResponseEntity<Card> getCardById(Long cardId) {
		// TODO Auto-generated method stub
		return LoginApiDelegate.super.getCardById(cardId);
	}

	@Override
	public ResponseEntity<Void> loginPost(LoginUser loginUser) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("AUTORIZE", "bearer bla");
		return new ResponseEntity<Void>(responseHeaders, HttpStatus.OK);
	}

}
