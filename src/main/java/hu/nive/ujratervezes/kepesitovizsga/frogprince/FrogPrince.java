package hu.nive.ujratervezes.kepesitovizsga.frogprince;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class FrogPrince {

    public Set<PlayerOfTale> getPlayersOfTale(DataSource dataSource, Tale tale) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select player_name, age, tale from tales where tale = ?;")) {
            stmt.setString(1, tale.toString());

            return getPlayers(stmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not get data.", sqle);
        }
    }

    private Set<PlayerOfTale> getPlayers(PreparedStatement stmt) throws SQLException {
        Set<PlayerOfTale> playersOfTale = new HashSet<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String name = rs.getString("player_name");
                int age = rs.getInt("age");
                Tale tale = Tale.valueOf(rs.getString("tale"));

                playersOfTale.add(new PlayerOfTale(name, age, tale));
            }
        }
        return playersOfTale;
    }
}
