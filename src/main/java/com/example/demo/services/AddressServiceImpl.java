package com.example.demo.services;

import com.example.demo.data.models.Address;
import com.example.demo.data.repositories.AddressRepository;
import com.example.demo.dtos.request.CreatePersonRequest;
import org.springframework.stereotype.Service;

import static com.example.demo.utils.Mapper.map;

@Service
public class AddressServiceImpl implements AddressService{
    private final AddressRepository addressRepository;
    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
    @Override
    public Address createAddress(CreatePersonRequest createPersonRequest) {
        Address address = Address.builder()
                .state(createPersonRequest.getState())
                .houseNumber(createPersonRequest.getHouseNumber())
                .streetName(createPersonRequest.getStreetName()).build();
        return addressRepository.save(address);
    }
    @Override
    public void deleteCorresponding(String id) {
        addressRepository.deleteById(Long.valueOf(id));
    }
    @Override
    public Address updatePersonAddress(String id, Address address) {
        Address foundAddress = addressRepository.findById(Long.valueOf(id)).get();
        Address updatedAddress = map(foundAddress, address);
        return addressRepository.save(updatedAddress);
    }
}
