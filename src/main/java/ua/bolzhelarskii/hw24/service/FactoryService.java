package ua.bolzhelarskii.hw24.service;

import ua.bolzhelarskii.hw24.dao.FactoryDao;
import ua.bolzhelarskii.hw24.objects.Factory;

public class FactoryService {
    private static final FactoryDao FACTORY_DAO = new FactoryDao();

    public String save(Factory factory) {
        FACTORY_DAO.save(factory);
        return factory.getId();
    }

    public Factory getById(String id) {
        return FACTORY_DAO.getById(id);
    }
}