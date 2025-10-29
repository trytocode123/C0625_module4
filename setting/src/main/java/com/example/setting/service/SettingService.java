package com.example.setting.service;

import com.example.setting.controller.SettingController;
import com.example.setting.entity.Setting;
import com.example.setting.repository.SettingRepository;
import org.springframework.stereotype.Service;

@Service
public class SettingService implements ISettingService {
    private final SettingRepository settingRepository;

    public SettingService(SettingRepository settingRepository) {
        this.settingRepository = settingRepository;
    }


    @Override
    public Setting update(Setting setting) {
        return settingRepository.update(setting);
    }
}
