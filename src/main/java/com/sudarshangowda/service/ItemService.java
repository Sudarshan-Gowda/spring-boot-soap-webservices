package com.sudarshangowda.service;

import org.springframework.stereotype.Service;
import com.sudarshangowda.generated.ItemRequest;
import com.sudarshangowda.generated.ItemResponse;

@Service
public class ItemService {

	public ItemResponse getItem(ItemRequest itemRequest) {
		ItemResponse itemResponse = new ItemResponse();
		itemResponse.setId(itemRequest.getId());
		itemResponse.setCategory("Sample Category_" + itemRequest.getId());
		itemResponse.setName("Sample ItemName_" + itemRequest.getId());
		return itemResponse;
	}
}
