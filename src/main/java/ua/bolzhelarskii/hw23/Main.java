package ua.bolzhelarskii.hw23;

import ua.bolzhelarskii.hw23.Service.CreateTable;
import ua.bolzhelarskii.hw23.Service.MyRepository;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        MyRepository.dropTables();
        CreateTable.createAndFillTables(4,10); //1
        System.out.println(MyRepository.getDevice(MyRepository.getDeviceIds().get(0))); //2
        MyRepository.updateDevice(MyRepository.getDeviceIds().get(0), "type", "TEST TEST TEST"); //3
        System.out.println(MyRepository.getDevice(MyRepository.getDeviceIds().get(0)));
        MyRepository.deleteDevice(MyRepository.getDeviceIds().get(0)); //4
        System.out.println(MyRepository.getDevice(MyRepository.getDeviceIds().get(0)));
        System.out.println();
        MyRepository.getDevicesListByFactoryId(MyRepository.getFactoryIds().get(0)); //5
        System.out.println();
        MyRepository.getCountAndSumForEachFactory(); //6
        MyRepository.closeConnection();
    }
}