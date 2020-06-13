package com.sudarshangowda.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.sudarshangowda.generated.ItemRequest;
import com.sudarshangowda.generated.ItemResponse;
import com.sudarshangowda.service.ItemService;

@Endpoint
public class ItemEndPoint {
	private static final String NAME_SPACE = "http://sudarshangowda.com/generated";
	@Autowired
	ItemService itemService;

	@PayloadRoot(namespace = NAME_SPACE, localPart = "ItemRequest")
	@ResponsePayload
	public ItemResponse getItems(@RequestPayload ItemRequest itemRequest) {
		return itemService.getItem(itemRequest);
	}
}
