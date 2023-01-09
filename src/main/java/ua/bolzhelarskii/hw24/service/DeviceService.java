package ua.bolzhelarskii.hw24.service;

import ua.bolzhelarskii.hw24.dao.DeviceDao;
import ua.bolzhelarskii.hw24.objects.Device;
import ua.bolzhelarskii.hw24.objects.DeviceDto;

import java.util.List;

public class DeviceService {
    private static final DeviceDao DEVICE_DAO = new DeviceDao();

    public void save(Device device) {
        DEVICE_DAO.save(device);
    }

    public Device getById(String id) {
        return DEVICE_DAO.getById(id);
    }

    public void change(String id, String column, String value) {
        DEVICE_DAO.change(id, column, value);
    }

    public List<Device> getDevicesListByFactoryId(String id) {
        return DEVICE_DAO.getDevicesListByFactoryId(id);
    }

    public List<DeviceDto> getCountAndSumForEachFactory() {
        return DEVICE_DAO.getCountAndSumForEachFactory();
    }

    public List<Device> getAll() {
        return DEVICE_DAO.getAll();
    }

    public void delete(Device device) {
        DEVICE_DAO.delete(device.getId());
    }
}