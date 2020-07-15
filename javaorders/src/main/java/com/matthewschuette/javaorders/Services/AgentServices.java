package com.matthewschuette.javaorders.Services;

import com.matthewschuette.javaorders.Models.Agents;

public interface AgentServices {
    Agents findAgentById(long id);
}
