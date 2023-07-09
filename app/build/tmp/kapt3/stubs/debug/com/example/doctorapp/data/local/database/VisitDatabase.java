package com.example.doctorapp.data.local.database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/doctorapp/data/local/database/VisitDatabase;", "Landroidx/room/RoomDatabase;", "()V", "remoteKeyDao", "Lcom/example/doctorapp/data/local/dao/RemoteKeyDao;", "getRemoteKeyDao", "()Lcom/example/doctorapp/data/local/dao/RemoteKeyDao;", "visitDao", "Lcom/example/doctorapp/data/local/dao/VisitDao;", "getVisitDao", "()Lcom/example/doctorapp/data/local/dao/VisitDao;", "app_debug"})
@androidx.room.Database(entities = {com.example.doctorapp.data.local.entity.VisitEntity.class, com.example.doctorapp.data.local.entity.RemoteKeyEntity.class}, version = 1, exportSchema = false)
public abstract class VisitDatabase extends androidx.room.RoomDatabase {
    
    public VisitDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.doctorapp.data.local.dao.VisitDao getVisitDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.doctorapp.data.local.dao.RemoteKeyDao getRemoteKeyDao();
}