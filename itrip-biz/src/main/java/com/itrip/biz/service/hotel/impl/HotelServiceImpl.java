package com.itrip.biz.service.hotel.impl;

import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.hotel.HotelService;
import com.itrip.dao.hotel.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 酒店的业务逻辑实现类
 */
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public List<Hotel> getHotels() {
        return hotelMapper.getHotels();
    }
}
