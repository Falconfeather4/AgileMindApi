package com.javabean.agilemind.repository;

import com.javabean.agilemind.domain.Project;
import com.javabean.agilemind.domain.Requirement;
import org.bson.types.ObjectId;

import java.util.List;

public interface ProjectRepository {
    List<Project> getProjects(ObjectId userId);

    Project saveProject(Project project);

    List<Requirement> getRequirements(ObjectId projectId);

    Project getProject(ObjectId projectId);

    Requirement saveRequirement(Requirement requirement);

    Requirement getRequirement(ObjectId requirementId);

    void deleteRequirement(ObjectId requirementId);
}
