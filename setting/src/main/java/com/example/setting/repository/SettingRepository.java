package com.example.setting.repository;

import com.example.setting.entity.Setting;
import org.springframework.stereotype.Controller;

@Controller
public class SettingRepository implements ISettingRepository {
    @Override
    public Setting update(Setting setting) {
        return setting;
    }
}
