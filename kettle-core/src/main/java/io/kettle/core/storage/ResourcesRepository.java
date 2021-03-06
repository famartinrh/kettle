package io.kettle.core.storage;

import java.util.List;

import io.kettle.core.resource.Resource;
import io.kettle.core.resource.ResourceKey;
import io.kettle.core.resource.extension.DefinitionResourceSpec;
import io.kettle.core.resource.type.ResourceType;

public interface ResourcesRepository {

    public boolean isCompatible(String connectionString);

    /**
     * Accepts any of it's names or short names
     * Returns null if not found
     */
    public DefinitionResourceSpec findDefinitionResourceByNames(String name);

    public void createResource(ResourceType resourceType, Resource resource);

    public void updateResource(ResourceType resourceType, Resource resource);

    public Resource deleteResource(ResourceKey key);

    public Resource getResource(ResourceKey key);

    /**
     * @param apiVersion in the form of group/version
     * @param kind
     * @param namespace can be null
     * @return
     */
    public List<Resource> list(String apiVersion, String kind, String namespace);

}
