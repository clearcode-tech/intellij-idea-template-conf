#set( $Server_name = $server_name.substring(0, 1).toUpperCase() + $server_name.substring(1))
import ru.ekd.commons.repositories_ebean.EbeanDatabaseSupplier;
import ru.ekd.commons.repositories_ebean.TenantEbeanCRUDRepository;
import ${PACKAGE_NAME}.business_logic.commons.IdServer;
import ${PACKAGE_NAME}.business_logic.models.${Model_name};
import ${PACKAGE_NAME}.business_logic.repositories.${Model_name}Repository;
import tech.clearcode.core.app_core.repositories.DatabaseExecutor;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.Executor;

/**
 * <p>Репозиторий для доступа к модели {@link ${Model_name}}.</p>
 */
@Singleton
public final class Ebean${Model_name}Repository
    extends TenantEbeanCRUDRepository<${Model_name}> implements ${Model_name}Repository {
    //region Ctor

    @Inject
    public Ebean${Model_name}Repository(
        @${Server_name}Server EbeanDatabaseSupplier databaseSupplier,
        @DatabaseExecutor Executor executor
    ) {
        super(${Model_name}.class, databaseSupplier, executor);
    }

    //endregion
    //region Public



    //endregion
}
