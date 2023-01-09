package ua.bolzhelarskii.hw24;

import ua.bolzhelarskii.hw24.objects.Device;
import ua.bolzhelarskii.hw24.objects.DeviceDto;
import ua.bolzhelarskii.hw24.service.Create;
import ua.bolzhelarskii.hw24.service.DeviceService;

public class Main {
    private static final DeviceService deviceService = new DeviceService();

    public static void main(String[] args) {
        Create.fillTables();
        Device device = deviceService.getAll().get(0);
        System.out.println(deviceService.getById(device.getId()));
        deviceService.change(device.getId(), "type", "TEST TEST TEST");
        System.out.println(deviceService.getById(device.getId()));
        System.out.println();
        System.out.println("Device count: =" + deviceService.getAll().size());
        System.out.println("Deleting Device...");
        deviceService.delete(device);
        System.out.println("Device count: = " + deviceService.getAll().size());
        System.out.println();
        System.out.println("Список устройств завода id = " + device.getFactory().getId());
        for (Device dev : deviceService.getDevicesListByFactoryId(device.getFactory().getId())) {
            System.out.println(dev);
        }
        System.out.println();
        for (DeviceDto dto : deviceService.getCountAndSumForEachFactory()) {
            System.out.println(dto);
        }
    }
}